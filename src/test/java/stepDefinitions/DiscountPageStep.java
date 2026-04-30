package stepDefinitions;

import base.Base;
import io.cucumber.java.en.*;
import pageObjects.DiscountPage;

public class DiscountPageStep extends Base{
	
	
	DiscountPage discountcheck;
	@Given("user is on Toy&Games page")
	public void user_is_on_toy_games_page() throws Exception {
		getDriver().get(this.getUrl());
		System.out.println("URL");
		Thread.sleep(2000);
		
		getDriver().manage().window().maximize();
		System.out.println("maximized");
		discountcheck=new DiscountPage(getDriver());
		discountcheck.getToysNGameslink().click();
		Thread.sleep(2000);
	}
	@When("user selects discount filter {int}% or more")
	public void user_selects_discount_filter_or_more(int int1) {
		discountcheck.selectDiscount(int1);
	}
	@Then("all displayed products should have discount applied")
	public void all_displayed_products_should_have_discount_applied() {
		
		System.out.println("yest to do");
	}

}
