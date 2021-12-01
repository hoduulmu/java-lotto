package lotto;

import lotto.domain.dto.LottoResult;
import lotto.domain.entity.Budget;
import lotto.domain.entity.LottoTickets;
import lotto.domain.entity.WinningTicket;
import lotto.domain.service.AutoMaticLottoTicketCreator;
import lotto.domain.service.LottoService;
import lotto.view.InputView;
import lotto.view.ResultView;
import lotto.view.View;
import lotto.view.ViewImpl;

public class LottoApplication {

  public static void main(String[] args) {
    View view = new ViewImpl(InputView.getInstance(), ResultView.getInstance());

    Budget budget = view.getBudget();
    LottoTickets manualTickets = view.getManualTickets();

    LottoService lottoService = new LottoService(new AutoMaticLottoTicketCreator());
    LottoTickets lottoTickets = lottoService.buyTheLottoTickets(budget, manualTickets);
    view.printBuyResult(manualTickets, lottoTickets);

    WinningTicket winningTicket = new WinningTicket(view.getWinning(), view.getBonus());
    LottoResult lottoResult = lottoService.getLottoResult(winningTicket, lottoTickets);

    view.printLottoResult(lottoResult);
  }

}
