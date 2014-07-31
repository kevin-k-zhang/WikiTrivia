package zhang.zink.impl;

import java.util.Collection;

import zhang.zink.interfaces.Topic;
import zhang.zink.interfaces.TopicId;

public class TopicImpl implements Topic {

    private final TopicId topicId;
    private final String displayString;
    private final Collection<Topic> subTopics;

    public TopicImpl(TopicId topicId, String displayString, Collection<Topic> subTopics) {
        this.topicId = topicId;
        this.displayString = displayString;
        this.subTopics = subTopics;
    }

    @Override
    public TopicId getTopicId() {
        return topicId;
    }

    @Override
    public String getDisplayString() {
        return displayString;
    }

    @Override
    public Collection<Topic> getSubTopics() {
        return subTopics;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((displayString == null) ? 0 : displayString.hashCode());
        result = prime * result + ((subTopics == null) ? 0 : subTopics.hashCode());
        result = prime * result + ((topicId == null) ? 0 : topicId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TopicImpl other = (TopicImpl) obj;
        if (displayString == null) {
            if (other.displayString != null) {
                return false;
            }
        } else if (!displayString.equals(other.displayString)) {
            return false;
        }
        if (subTopics == null) {
            if (other.subTopics != null) {
                return false;
            }
        } else if (!subTopics.equals(other.subTopics)) {
            return false;
        }
        if (topicId == null) {
            if (other.topicId != null) {
                return false;
            }
        } else if (!topicId.equals(other.topicId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TopicImpl [topicId=" + topicId + ", displayString=" + displayString
                + ", subTopics=" + subTopics + "]";
    }

}
