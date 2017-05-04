package bridges;

/**
 * Created by admin on 04.05.2017.
 */
public class Inspector {
    private BasicSocialWeb basicSocialWeb;

    public Inspector(BasicSocialWeb basicSocialWeb) {
        this.basicSocialWeb = basicSocialWeb;
    }

    public void chechPayments(BasicSocialWeb basicSocialWeb){
        if(basicSocialWeb instanceof VKSocialWeb) {
            System.out.println(" VKSocialWeb money " + basicSocialWeb.getMoney());
        }
        if (basicSocialWeb instanceof FacebookSocialWeb)
        {
            System.out.println(" FacebookSocialWeb money " + basicSocialWeb.getMoney());
        }

    }

}
