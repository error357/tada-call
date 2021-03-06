package tada;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CallRepository extends PagingAndSortingRepository<Call, Long>{

    Call findByCallId(Long callId);

}