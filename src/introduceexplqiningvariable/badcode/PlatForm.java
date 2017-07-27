package introduceexplqiningvariable.badcode;

/**
 * 《重构》 P124：引入解释性变量 
 * 1、将复杂的表达式的结果放进一个临时变量，并使用命名名称来解释表达式的用途。
 * 2、在下面例子中的条件逻辑中，这种重构方法特别的有用，我们可以使用良好的命名来解释每个条件子句表达的意义。
 * 3、在较长的算法中我们也可以使用临时变量来解释每一步元算的意义。
 * 4、我们可以使用final关键字来声明临时变量。
 * @author Vincent
 *
 */
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

	boolean isInitialized() {
		return isInitialized;
	}

	/**
	 * 该方法中的条件子句，可以使用临时变量来代替
	 */
	void checkRuntimeEnvironment() {
		if (plateForm.toUpperCase().indexOf("MAC") > -1
				&& browser.toUpperCase().indexOf("IE") > -1 && isInitialized
				&& resize > 0) {
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
