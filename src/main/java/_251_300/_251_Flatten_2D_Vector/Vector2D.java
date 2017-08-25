package _251_300._251_Flatten_2D_Vector;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/**
 * @author Zhiwei.Xin
 * @version 1.0 on 8/24/2017.
 */
public class Vector2D implements Iterator<Integer> {
  private final Deque<Integer> deque;

  public Vector2D(List<List<Integer>> vec2d) {
    deque = new ArrayDeque<>();
    for (List<Integer> child : vec2d) {
      for (int cChild : child) {
        deque.addLast(cChild);
      }
    }
  }

  @Override
  public Integer next() {
    return deque.removeFirst();
  }

  @Override
  public boolean hasNext() {
    return !deque.isEmpty();
  }
}
