package model.fileIO

import model.DeskInterface

trait FileIOInterface {
  def load: Option[DeskInterface]
  def save(desk: DeskInterface): Unit
  def toJson(grid: DeskInterface): JsObject
}
