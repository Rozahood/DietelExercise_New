package OPP.Phonebook;

public class Settings {
    private String goToHelp;
    private String showBlockNumbers;
    private String openBlackList;

    public Settings(String goToHelp, String showBlockNumbers, String openBlackList) {
        this.goToHelp = goToHelp;
        this.showBlockNumbers = showBlockNumbers;
        this.openBlackList = openBlackList;
    }

    public String getGoToHelp() {
        return goToHelp;
    }

    public void setGoToHelp(String goToHelp) {
        this.goToHelp = goToHelp;
    }

    public String getShowBlockNumbers() {
        return showBlockNumbers;
    }

    public void setShowBlockNumbers(String showBlockNumbers) {
        this.showBlockNumbers = showBlockNumbers;
    }

    public String getOpenBlackList() {
        return openBlackList;
    }

    public void setOpenBlackList(String openBlackList) {
        this.openBlackList = openBlackList;
    }
}
