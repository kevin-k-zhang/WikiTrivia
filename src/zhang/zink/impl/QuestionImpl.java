package zhang.zink.impl;

import java.util.Collection;

import zhang.zink.interfaces.Question;

public class QuestionImpl implements Question {

    private final String questionString;
    private final String answer;
    private final Collection<String> fauxAnswers;

    public QuestionImpl(String questionString, String answer, Collection<String> fauxAnswers) {
        this.questionString = questionString;
        this.answer = answer;
        this.fauxAnswers = fauxAnswers;
    }

    @Override
    public String getQuestionString() {
        return questionString;
    }

    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public Collection<String> getFauxAnswers() {
        return fauxAnswers;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((answer == null) ? 0 : answer.hashCode());
        result = prime * result + ((fauxAnswers == null) ? 0 : fauxAnswers.hashCode());
        result = prime * result + ((questionString == null) ? 0 : questionString.hashCode());
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
        QuestionImpl other = (QuestionImpl) obj;
        if (answer == null) {
            if (other.answer != null) {
                return false;
            }
        } else if (!answer.equals(other.answer)) {
            return false;
        }
        if (fauxAnswers == null) {
            if (other.fauxAnswers != null) {
                return false;
            }
        } else if (!fauxAnswers.equals(other.fauxAnswers)) {
            return false;
        }
        if (questionString == null) {
            if (other.questionString != null) {
                return false;
            }
        } else if (!questionString.equals(other.questionString)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QuestionImpl [questionString=" + questionString + ", answer=" + answer
                + ", fauxAnswers=" + fauxAnswers + "]";
    }

}
