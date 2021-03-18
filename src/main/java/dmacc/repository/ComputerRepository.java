/**  
* @author Levi Olson - lolson17  
* CIS175 - Spring 2021  
* Mar 17, 2021  
*/

package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Computer;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long> {

}
