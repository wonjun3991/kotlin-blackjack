package blackjack.io

import blackjack.domain.Player

class Output {
    fun printPlayersCard(players: List<Player>) {
        println("${players.joinToString(",") { it.name }}에게 2장의 나누었습니다.")
        players.forEach {
            printPlayerCard(it)
        }
    }

    fun printDistribution() {
        println()
    }

    fun printPlayerCard(player: Player) {
        println("${player.name} 카드 : ${player.hand.joinToString(",")}")
    }

    fun printPlayersResult(players: List<Player>) {
        players.forEach {
            printPlayerResult(it)
        }
    }

    fun printPlayerResult(player: Player) {
        println("${player.name} 카드 : ${player.hand.joinToString(",")} - 결과 : ${player.score()}")
    }
}
