/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.entity.projectile;

import com.google.common.base.Optional;
import org.spongepowered.api.item.ItemStack;

import javax.annotation.Nullable;

/**
 * Represents a fish hook.
 */
public interface FishHook extends Projectile {

    /**
     * Sets the hooked item for this fish hook.
     * <p>The hooked item may change depending on the type of fishing rod
     * used to cast this fish hook. The hooked item may also be null.</p>
     *
     * @return The hooked item, if available
     */
    Optional<ItemStack> getHookedItem();

    /**
     * Sets the hooked item for this fish hook.
     * <p>The hooked item may change depending on the type of fishing rod
     * used to cast this fish hook. The hooked item may also be null.</p>
     *
     * @param item The hooked item
     */
    void setHookedItem(@Nullable ItemStack item);

}
