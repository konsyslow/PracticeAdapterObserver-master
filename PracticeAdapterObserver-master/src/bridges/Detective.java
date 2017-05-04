package bridges;

/**
 * Created by admin on 04.05.2017.
 */
public class Detective {
    private BasicSocialWeb basicSocialWeb;

    public Detective(BasicSocialWeb basicSocialWeb) {
        this.basicSocialWeb = basicSocialWeb;
    }

    public void createDossier(BasicSocialWeb basicSocialWeb){
        System.out.println(" friends "+ basicSocialWeb.getFriends());
        System.out.println(" wall "+ basicSocialWeb.wall());


    }


}
