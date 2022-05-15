package co.kr.yapp.android.domain.usecase

import co.kr.yapp.android.domain.model.BusEntity
import co.kr.yapp.android.domain.model.Result
import co.kr.yapp.android.domain.repository.BusRepository
import javax.inject.Inject

class GetBusUseCase @Inject constructor(
    private val busRepository: BusRepository
) {
    suspend operator fun invoke(startIndex: Int, endIndex: Int): Result<List<BusEntity>> {
        return busRepository.getBus(startIndex, endIndex)
    }
}