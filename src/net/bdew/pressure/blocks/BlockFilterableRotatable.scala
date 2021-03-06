/*
 * Copyright (c) bdew, 2013 - 2016
 * https://github.com/bdew/pressure
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://bdew.net/minecraft-mod-public-license/
 */

package net.bdew.pressure.blocks

import net.bdew.lib.block.HasTE
import net.bdew.lib.rotate.BaseRotatableBlock

trait BlockFilterableRotatable extends BlockFilterable with BaseRotatableBlock {
  this: HasTE[_ <: TileFilterable] =>
}
