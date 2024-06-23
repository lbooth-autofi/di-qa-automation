package com.autofi.di.qa.automation.resources.lioness.dealerportal.testSteps.dealers;

import com.autofi.di.qa.automation.resources.BasePageObject;
import com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers.CaptiveLender;
import com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers.Lender;
import com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers.LenderType;
import com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers.LendersSection;
import org.openqa.selenium.WebDriver;

public class LendersSectionSteps extends BasePageObject {

    public LendersSectionSteps(WebDriver driver) {
        super(driver);
    }

    DealerViewSteps dealerViewSteps = new DealerViewSteps(getDriver());

    LendersSection lendersSection = new LendersSection(getDriver());

    public boolean isLenderInViewArea(Lender lender) {
        boolean isInViewArea = false;

        if (lender.getLenderType() == LenderType.CAPTIVE_LENDER) {
            CaptiveLender captiveLender = (CaptiveLender) lender;
            isInViewArea = dealerViewSteps.isElementInViewArea(
                    lendersSection.getCaptiveLenderElement(captiveLender.getCaptiveLender())
            );
        }

        return isInViewArea;
    }

    public void scrollLenderIntoViewArea(Lender lender) {

    }
}
