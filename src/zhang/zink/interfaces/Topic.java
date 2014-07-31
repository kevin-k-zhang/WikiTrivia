package zhang.zink.interfaces;

import java.util.Collection;

public interface Topic {

    TopicId getTopicId();

    String getDisplayString();

    Collection<Topic> getSubTopics();

}
