package design_patterns.design_patterns.Behavioral.Iterator_pattern;



public class TopicList implements List<Topic>
{
    private Topic[] topics;
     
    public TopicList(Topic[] topics)
    {
        this.topics = topics;
    }
     
    @Override
    public Iterator<Topic> iterator() {
        return new TopicIterator(topics);
    }
}