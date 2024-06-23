package com.autofi.di.qa.automation.resources.lioness.dealerportal.testSteps.dealers;

import com.autofi.di.qa.automation.resources.BasePageObject;
import com.autofi.di.qa.automation.resources.lioness.dealerportal.views.dealers.DealerView;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DealerViewSteps extends BasePageObject {

    public DealerViewSteps(WebDriver driver) {
        super(driver);
    }

    DealerView dealerView = new DealerView(getDriver());

    public int getBottomSectionHeight() {
        return dealerView.getBottomSectionElement().getRect().getHeight();
    }

    public boolean isElementInViewArea(WebElement element) {
        boolean isAboveLowerXBound = true;
        boolean isBelowLowerXBound = true;
        boolean isBelowUpperYBound = true;
        boolean isAboveLowerYBound = false;
        boolean isInViewArea = false;

        isAboveLowerYBound = element.getRect().getY() < dealerView.getBottomSectionElement().getRect().getY();

        if(isAboveLowerXBound && isBelowLowerXBound && isBelowUpperYBound && isAboveLowerYBound) {
            isInViewArea = true;
        }

        return isInViewArea;
    }

    public void scrollElementIntoViewArea(WebElement element) {

    }

}
