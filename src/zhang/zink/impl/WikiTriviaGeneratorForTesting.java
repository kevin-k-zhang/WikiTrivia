package zhang.zink.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import zhang.zink.interfaces.Question;
import zhang.zink.interfaces.Topic;
import zhang.zink.interfaces.TopicId;
import zhang.zink.interfaces.WikiTriviaGenerator;

public class WikiTriviaGeneratorForTesting implements WikiTriviaGenerator {

    private final Collection<Topic> topics;
    private final Collection<Question> questions;

    public WikiTriviaGeneratorForTesting() {
        TopicId topicId = new TopicIdImpl("foo");
        Topic topic = new TopicImpl(topicId, "Countries", Collections.<Topic>emptyList());
        this.topics = Collections.singleton(topic);
        Collection<String> fauxAnswers = new ArrayList<String>(Arrays.asList("Canada", "Mexico", "England"));
        Question question = new QuestionImpl("What country are we in?", "USA", fauxAnswers);
        this.questions = Collections.singleton(question);
    }

    @Override
    public Collection<Topic> getTopics() {
        return topics;
    }

    @Override
    public Collection<Question> getQuestionsForTopic(Topic topic, int numberOfQuestions) {
        return questions;
    }

}
