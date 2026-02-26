package lab2;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits using the Fibonacci sequence.
 */
public class RabbitModel4
{
  private int population;
  private int lastYear;
  private int yearBefore;

  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel4()
  {
    reset();
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
    int newPopulation = lastYear + yearBefore;

    yearBefore = lastYear;
    lastYear = newPopulation;
    population = newPopulation;
  }

  /**
   * Sets or resets the state of the model to the
   * initial conditions.
   */
  public void reset()
  {
    yearBefore = 0;
    lastYear = 1;
    population = 1;
  }
}
