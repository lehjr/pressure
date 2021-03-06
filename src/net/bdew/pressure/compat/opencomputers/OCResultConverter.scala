/*
 * Copyright (c) bdew, 2013 - 2016
 * https://github.com/bdew/pressure
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://bdew.net/minecraft-mod-public-license/
 */

package net.bdew.pressure.compat.opencomputers

import net.bdew.lib.computers.{Result, SimpleResultConverter}

import scala.concurrent.Future

object OCResultConverter extends SimpleResultConverter {
  override def handleFuture(future: Future[Result]) = new OCFutureWrapper(future)
}
