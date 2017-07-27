package introduceexplqiningvariable.goodcode;

public class PlatForm {
	private String plateForm;
	private String browser;
	private int resize;
	private boolean isInitialized;

	PlatForm(String plateForm, String browser, int resize, boolean isInitialized) {
		this.plateForm = plateForm;
		this.browser = browser;
		this.resize = resize;
		this.isInitialized = isInitialized;
	}

	boolean initialized() {
		return isInitialized;
	}

	void checkRuntimeEnvironment() {
		final boolean isMacOS = plateForm.toUpperCase().indexOf("MAC") > -1;
		final boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > -1;
		final boolean wasResized = resize > 0;
		final boolean wasInitialized = initialized();
		final boolean wasResize = resize > 0;
		if (isMacOS && isIEBrowser && wasResized && wasInitialized && wasResize) {
			System.out.println("Runtime Environment is OK...");
		} else {
			System.err.println("Runtime Environment error...");
		}
	}

	public String getPlateForm() {
		return plateForm;
	}

	public void setPlateForm(String plateForm) {
		this.plateForm = plateForm;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public int getResize() {
		return resize;
	}

	public void setResize(int resize) {
		this.resize = resize;
	}

	public void setInitialized(boolean isInitialized) {
		this.isInitialized = isInitialized;
	}

}
