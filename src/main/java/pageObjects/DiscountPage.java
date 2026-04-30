package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DiscountPage {
	
	WebDriver driver;
	By toysNGameslink=By.xpath("//a[text()='Toys & Games']");
	By discountFilter=By.xpath("//div[@id='p_n_pct-off-with-tax-title']/following-sibling::ul//a");
	By discountOptions = By.xpath("//span[contains(text(),'% Off or more')]");
	public DiscountPage(WebDriver driver) {
		
		this.driver = driver;
	}
	public WebElement getToysNGameslink() {
		return driver.findElement(this.toysNGameslink);
	}
	
	
	public List<WebElement> getDiscountFilter() {
		return this.driver.findElements(this.discountFilter);
	}
	
	 public void selectDiscount(int discount) {
	        String xpath = "//span[contains(text(),'" + discount + "% Off or more')]";
	        driver.findElement(By.xpath(xpath)).click();
	    }

	/* // Example: 10%, 25%, 50%, 70%
    By discountOptions = By.xpath("//span[contains(text(),'% Off or more')]");

    // 🛒 Product discount labels (on product cards)
    By productDiscountLabels = By.xpath("//span[contains(text(),'% off') or contains(text(),'% Off')]");

    // 📦 Product list
    By products = By.xpath("//div[@data-component-type='s-search-result']");

    // ================= ACTION METHODS ================= //

    // Click specific discount filter (like "30% Off or more")
    public void selectDiscount(String discount) {
        String xpath = "//a[contains(@aria-label,'" + discount + "')]";
        driver.findElement(By.xpath(xpath)).click();
    }

    // Get all product discount elements
    public List<WebElement> getAllDiscounts() {
        return driver.findElements(productDiscountLabels);
    }

    // Get all products
    public List<WebElement> getAllProducts() {
        return driver.findElements(products);
    }

    // Extract numeric discount value (e.g., "50% off" → 50)
    public int getDiscountValue(String discountText) {
        return Integer.parseInt(discountText.replaceAll("[^0-9]", ""));
    }

    // Validate all products meet discount criteria
    public boolean validateDiscounts(int expectedDiscount) {
        List<WebElement> discounts = getAllDiscounts();

        for (WebElement ele : discounts) {
            String text = ele.getText();
            int value = getDiscountValue(text);

            if (value < expectedDiscount) {
                return false;
            }
        }
        return true;
    }*/
}
	


