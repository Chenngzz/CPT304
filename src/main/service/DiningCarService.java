package top.naccl.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.naccl.bean.DiningCar;
import top.naccl.bean.Food;
import top.naccl.bean.User;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface DiningCarService {

	List<Food> getUserFoods(Integer id);

	Optional<DiningCar> findById(Integer cartId);

	Page<Food> getUserFoods(Integer id, Pageable pageable);

	Map<User, List<Food>> getOrders();

	List<String[]> getOrdersV2();

	List<String[]> getOrdersV2BYCode(String ordCode);

	DiningCar saveDiningCar(DiningCar diningCar);

	void deleteDiningCarByUserIdAndFoodId(Integer userId, Integer foodId);

	// Delete all relevant diningcar rows based on foodId
	void deleteByFoodId(Integer foodId);

	DiningCar getDriverCarByFoodId(Integer foodId, Integer userId);

	List<DiningCar> findAllByUserId(Integer userId);
}
