package zhang.zink.interfaces;

import java.util.Collection;

public interface Question {

    String getQuestionString();

    String getAnswer();

    Collection<String> getFauxAnswers();

}
