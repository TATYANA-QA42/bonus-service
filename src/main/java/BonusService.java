public class BonusService {
  public float calculate(float amount, boolean registered) {
    int percent = registered ? 3 : 1;
    float bonus = amount * percent / 100 / 100;
    float limit = 500;
    if (bonus > limit) {
      bonus = limit;
    }
    return bonus;
  }
}


