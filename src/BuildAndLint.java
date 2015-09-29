import com.intellij.ide.DataManager;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataContext;

/**
 * Created by user on 9/27/2015.
 */
public class BuildAndLint extends AnAction {
    public void actionPerformed(AnActionEvent e) {
        String[] actions = {"CompileProject", "InspectCode"};
        for(String action: actions) {
            AnAction anAction = ActionManager.getInstance().getAction(action);

            DataContext context = e.getDataContext(); //DataManager.getInstance().getDataContext();
            AnActionEvent anActionEvent = new AnActionEvent(null, context, "", anAction.getTemplatePresentation(), ActionManager.getInstance(), 0);

            anAction.actionPerformed(anActionEvent);
        }
    }
}
