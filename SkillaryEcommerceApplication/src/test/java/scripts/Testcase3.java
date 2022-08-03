package scripts;

import org.testng.annotations.Test;

import genericLib.BasicClass;
import pomPages.SkillraryPage;

public class Testcase3 extends BasicClass{
@Test
public void tc3() {
	SkillraryPage s=new SkillraryPage(driver);
	s.serachtextbox(pdata.getData(searchtextbox));
	
}
}
