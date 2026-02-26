package lab2;

import java.util.Random;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel3
{
  private int population;
  Random rand = new Random();

  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel3()
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
   * passing of one year.
   */
  public void simulateYear()
  {
    population += rand.nextInt(10);
  }

  /**
   * Sets or resets the state of the model to the
   * initial conditions.
   */
  public void reset()
  {
    population = 2;
  }
}
