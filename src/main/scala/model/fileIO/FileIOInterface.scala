package model.fileIO

import model.DeskInterface
import play.api.libs.json.JsObject

trait FileIOInterface {
  def load: Option[DeskInterface]
  def save(desk: DeskInterface): Unit
  def toJson(grid: DeskInterface): JsObject
}
