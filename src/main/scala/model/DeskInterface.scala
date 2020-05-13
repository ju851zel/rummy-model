package model

import model.deskComp.deskBaseImpl.{PlayerInterface, TileInterface}

import scala.collection.immutable.SortedSet

trait DeskInterface {

  val players: List[PlayerInterface]
  val bagOfTiles: Set[TileInterface]
  val table: Set[SortedSet[TileInterface]]

  def takeUpTile(p: PlayerInterface, t: TileInterface): DeskInterface
  def removeFromTable(t: TileInterface): DeskInterface
  def putDownTile(p: PlayerInterface, t: TileInterface): DeskInterface
  def amountOfPlayers: Int
  def checkTable(): Boolean
  def getPreviousPlayer: PlayerInterface
  def getCurrentPlayer: PlayerInterface
  def getNextPlayer: PlayerInterface
  def tryToMoveTwoTilesOnDesk(t1: TileInterface, t2: TileInterface): DeskInterface
  def tableContains(t: TileInterface): Boolean
  def getTileFromBag: TileInterface
  def addPlayer(p: PlayerInterface): DeskInterface
  def removePlayer(p: PlayerInterface): DeskInterface
  def takeTileFromBagToPlayer(p: PlayerInterface, t: TileInterface): DeskInterface
  def takeTileFromPlayerToBag(p: PlayerInterface, t: TileInterface): DeskInterface
  def lessThan4P: Boolean
  def correctAmountOfPlayers: Boolean
  def currentPlayerWon(): Boolean
  def boardView: SortedSet[TileInterface]
  def tableView: Set[SortedSet[TileInterface]]
  def getPlayerByName(playerName: String): Option[PlayerInterface]
  def switchToPreviousPlayer: DeskInterface
  def switchToNextPlayer: DeskInterface
}
