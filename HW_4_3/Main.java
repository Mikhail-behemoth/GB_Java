//Исключения в программировании и их обработка (семинары) 

package HW_4_3;

import HW_4_3.controllers.UserController;
import HW_4_3.model.FileOperation;
import HW_4_3.model.FileOperationImpl;
import HW_4_3.model.Repository;
import HW_4_3.model.RepositoryFile;
import HW_4_3.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
