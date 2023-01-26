package notes;

import notes.controllers.UserController;
import notes.model.FileOperation;
import notes.model.FileOperationImpl;
import notes.model.Repository;
import notes.model.RepositoryFile;
import notes.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("notes.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
