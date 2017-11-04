class Parrot

  protected

  def base_speed
    12.0
  end

end

class EuropeanParrot < Parrot

  def speed
    return base_speed
  end

end

class AfricanParrot < Parrot

  def initialize number_of_coconuts
    @number_of_coconuts = number_of_coconuts
  end

  def speed
    return [0, base_speed - load_factor * @number_of_coconuts].max
  end

  private

  def load_factor
    9.0
  end

end

class NorwegianBlueParrot < Parrot

  def initialize voltage, nailed
    @voltage = voltage
    @nailed = nailed
  end

  def speed
    return (@nailed) ? 0 : compute_base_speed_for_voltage
  end

  private

  def compute_base_speed_for_voltage
    [24.0, @voltage * base_speed].min
  end

end
