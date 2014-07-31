package zhang.zink.interfaces;

import java.util.Collection;

public interface WikiTriviaGenerator {

    Collection<Topic> getTopics();

    Collection<Question> getQuestionsForTopic(Topic topic, int numberOfQuestions);

}
