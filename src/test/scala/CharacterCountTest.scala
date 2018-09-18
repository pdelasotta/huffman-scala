import org.scalatest._

import scala.collection.mutable.Stack

class CharacterCountTest extends FlatSpec with Matchers {
  "CharacterCounter" should "count characters from a given String" in {
    CharacterCounter.count("four") should be (4);
  }

  "CharacterCounter" should "count occurrences for each character" in {
    CharacterCounter.count("four") should be (4);
  }
}
