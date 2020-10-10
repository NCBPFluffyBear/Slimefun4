package io.github.thebusybiscuit.slimefun4.api.items.settings;

import javax.annotation.ParametersAreNonnullByDefault;

import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;

/**
 * This variation of {@link ItemSetting} allows you to define an {@link Double} range
 * and enforces this range using the {@link #validateInput(Double)} method.
 * 
 * @author TheBusyBiscuit
 * 
 * @see ItemSetting
 * @see IntRangeSetting
 *
 */
public class DoubleRangeSetting extends ItemSetting<Double> {

    private final double min;
    private final double max;

    @ParametersAreNonnullByDefault
    public DoubleRangeSetting(String key, double min, double defaultValue, double max) {
        super(key, defaultValue);

        this.min = min;
        this.max = max;
    }

    @Override
    public boolean validateInput(Double input) {
        return super.validateInput(input) && input >= min && input <= max;
    }

    /**
     * This returns the minimum value of this {@link DoubleRangeSetting}.
     * 
     * @return The minimum value
     */
    public double getMinimum() {
        return min;
    }

    /**
     * This returns the maximum value of this {@link DoubleRangeSetting}.
     * 
     * @return The maximum value
     */
    public double getMaximum() {
        return max;
    }

}
