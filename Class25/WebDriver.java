package Class25;

public interface WebDriver {
    void openBrowser();

    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("You can open Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("You can close Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("You can maximize the window on Chrome Browser");
    }

    @Override
    public void findElement() {
        System.out.println("You can find the element in Chrome Browser");
    }
}
class FirefoxDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("You can open Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("You can close Firefox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("You can maximize the window on Firefox Browser");
    }

    @Override
    public void findElement() {
        System.out.println("You can find the element in Firefox Browser");
    }


    public static void main(String[] args) {

        WebDriver[] array = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver arr:array) {
            arr.openBrowser();
            arr.closeBrowser();
            arr.maximizeWindow();
            arr.findElement();
        }
    }
}
