package blackjack.domain.participant.state

import blackjack.domain.participant.GameResult

class Bust(cards: Cards) : Finished(cards) {
    override fun judgementGameResult(otherScore: Score): GameResult = GameResult.LOSE
}