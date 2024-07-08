import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ngWDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//driver.manage.window.maximize();
		driver.get("https://maustats.itechmission.org/dms");
		
		////LOGIN
		WebElement username = driver.findElement(By.id("userName"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("admin@maustats.org");
		password.sendKeys("2@24MauStats");
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement login = driver.findElement(By.xpath("//body/app-root[1]/app-auth-layout[1]/app-login[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[4]/button[1]"));
		login.click();
		System.out.println("1. Login is successful");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		////DATA MANAGEMENT
		WebElement leftmenu = driver.findElement(By.xpath("//*[@id=\"accordionMainSidebar\"]/li[2]/a/img"));
		leftmenu.click();
		System.out.println("2. Data Management");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		////PRIMARY DATA
		WebElement primarydata = driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/app-sidebar/div/ul/li[2]/ul/li[2]/a"));
		primarydata.click();
		System.out.println("3. Primary data");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		////INGEST DATA
		WebElement ingest = driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/app-list/div[1]/div/div/app-add-edit/div[1]/form/div[1]"));
		ingest.click();
		
		WebElement filename=driver.findElement(By.id("mat-input-9"));
		filename.sendKeys("03.04 Net migration between districts of migrants");
		
		WebElement browsefile = driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/app-list/div[1]/div/div/app-add-edit/div[1]/form/div[3]/div/div/div[2]/div/div[2]/div/button"));
		browsefile.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement searchFile = driver.findElement(By.xpath("//*[@id=\"sourceLocationPopup\"]/div/div/div[2]/div[1]/form/div/div/img"));
		searchFile.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement file=driver.findElement(By.xpath("//*[@id=\"source-Location\"]"));
		file.sendKeys("Net migration between districts of migrant");
		
		WebElement selectOp= driver.findElement(By.id("0"));
		selectOp.click();
		
		WebElement ok=driver.findElement(By.xpath("//*[@id=\"sourceLocationPopup\"]/div/div/div[3]/div/button"));
		ok.click();
		
		WebElement topic= driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/app-list/div[1]/div/div/app-add-edit/div[1]/form/div[3]/div/div/div[3]/div/div[2]/div/button"));
		topic.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement census = driver.findElement(By.id("652cd27d032350147c94b894"));
		census.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement oktopic=driver.findElement(By.xpath("//*[@id=\"selectTargetPopup\"]/div/div/div[3]/div/button"));
		oktopic.click();
		
		WebElement header = driver.findElement(By.id("mat-input-22"));
		header.sendKeys("2");
		
		WebElement header2= driver.findElement(By.id("mat-input-23"));
		header2.sendKeys("5");
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement row= driver.findElement(By.id("mat-input-12"));
		row.sendKeys("7");
		
		WebElement row2 = driver.findElement(By.id("mat-input-13"));
		row2.sendKeys("17");
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement column = driver.findElement(By.id("mat-input-14"));
		column.sendKeys("1");
		
		WebElement column2= driver.findElement(By.id("mat-input-15"));
		column2.sendKeys("12");
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement ingestbutton = driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/app-list/div[1]/div/div/app-add-edit/div[1]/form/div[4]/button"));
		ingestbutton.click();
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.get("https://maustats.itechmission.org/dms/data-exchange/primary");
		driver.navigate().refresh();
		System.out.println("4. Ingested");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement ingestdropdown = driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/app-list/div[1]/div/div/div[2]/div/div[1]/div/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[1]/datatable-body-row/div[2]/datatable-body-cell[6]/div/div/button"));
		ingestdropdown.click();
		
		
		System.out.println("5. Clicked Ingest dropdown");
		
		WebElement movefilter = driver.findElement(By.xpath("//*[@id=\"nav-ingestion\"]/div/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[1]/datatable-body-row/div[2]/datatable-body-cell[6]/div/div/ul/li[3]/a"));
		movefilter.click();
		System.out.println("6. Moved to filter");
		
		WebElement Filter = driver.findElement(By.xpath("//*[@id=\"nav-completed-tab\"]"));
		Filter.click();
		System.out.println("7. View Filter List");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement FilerDropdown = driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/app-list/div[1]/div/div/div[2]/div/div[2]/div/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[1]/datatable-body-row/div[2]/datatable-body-cell[7]/div/div/button"));
		FilerDropdown.click();
		System.out.println("8. Clicked Filter Dropdown");
		
		WebElement FilterData = driver.findElement(By.xpath("//*[@id=\"nav-analytics\"]/div/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[1]/datatable-body-row/div[2]/datatable-body-cell[7]/div/div/ul/li[1]/a"));
		FilterData.click();
		System.out.println("9. Filter data");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement Filterdata = driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/app-list/div[12]/div/div/div[2]/div[1]/div/div/mat-stepper/div/div[2]/div[1]/form/div/div[1]/div/div[1]/div/mat-form-field/div[1]/div[2]/div"));
		Filterdata.sendKeys("District of origin (from) Black River value is greater than 0");
		System.out.println("10. Filter data - Input name");
		
		WebElement Filterdropdown = driver.findElement(By.xpath("//*[@id=\"mat-select-value-45\"]"));
		Filterdropdown.click();
		System.out.println("11. Filter data - Select Column");
		
		
		
	}

}
