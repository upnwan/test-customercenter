package nosmoke;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Mypage_table")
public class Mypage {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long checkInId;
        private Long point;
        private Long earnId;
        private Long deductId;
        private Long smokingAreaId;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public Long getCheckInId() {
            return checkInId;
        }

        public void setCheckInId(Long checkInId) {
            this.checkInId = checkInId;
        }
        public Long getPoint() {
            return point;
        }

        public void setPoint(Long point) {
            this.point = point;
        }
        public Long getEarnId() {
            return earnId;
        }

        public void setEarnId(Long earnId) {
            this.earnId = earnId;
        }
        public Long getDeductId() {
            return deductId;
        }

        public void setDeductId(Long deductId) {
            this.deductId = deductId;
        }
        public Long getSmokingAreaId() {
            return smokingAreaId;
        }

        public void setSmokingAreaId(Long smokingAreaId) {
            this.smokingAreaId = smokingAreaId;
        }

}
