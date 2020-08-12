/*
 * Copyright (c) 2020, Matt12yearslater <https://github.com/Matt12yearslater>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.maxhit;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("maxhit")
public interface MaxHitConfig extends Config {

    @ConfigItem(
            keyName = "maxhit",
            name = "Max Hit",
            description = "Display max hit in current setup",
            position = 1
    )
    default boolean maxHit() { return true; }

    @ConfigItem(
            keyName = "showSpec",
            name = "Show Max Spec",
            description = "Show max spec in current setup",
            position = 2
    )
    default boolean showSpec() { return true; }

    @ConfigItem(
            keyName = "showMagic",
            name = "Show Magic",
            description = "Show max hit in current setup with selected spell",
            position = 3
    )
    default boolean showMagic() { return false; }

    @ConfigItem(
            keyName = "spellChoice",
            name = "Spell",
            description = "Choose spell to calculate max",
            position = 4
    )
    default MagicSpell spellChoice() { return MagicSpell.ICE_BARRAGE; }

    @ConfigItem(
            keyName = "applyCharge",
            name = "Apply Charge Spell",
            description = "Calculate max hit of spell using charge (god spells)",
            position = 5
    )
    default boolean applyCharge() { return false; }
}

