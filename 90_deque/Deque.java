public interface Deque<Card>{
  public void addFirst(Card e);
  public void addLast(Card e);
  public Card removeFirst();
  public Card removeLast();
  public Card getFirst();
  public Card getLast();

  public Card peekFirst();
  public Card peekLast();
  public Card pollFirst();
  public Card pollLast();
  public boolean offerFirst(Card e);
  public boolean offerLast(Card e);
}

public class QQKachoo<D> implements Deque<D>{

}
