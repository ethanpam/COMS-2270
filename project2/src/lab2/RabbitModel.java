package lab2;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits using the Fibonacci sequence.
 */
public class RabbitModel
{
  private int population;

  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel()
  {
    population = 2;
  }

  /**
   * Returns the current number of rabbits.
   * @return current rabbit population
   */
  public int getPopulation()
  {
    return population;
  }

  /**
   * Updates the population to simulate the
   * passing of one year using Fibonacci growth.
   */
  public void simulateYear()
  {
    population += 1;
  }

  /**
   * Sets or resets the state of the model to the
   * initial conditions.
   */
  public void reset()
  {
    population = 0;
  }
}
