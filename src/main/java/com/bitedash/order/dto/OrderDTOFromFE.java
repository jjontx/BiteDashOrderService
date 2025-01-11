package com.bitedash.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTOFromFE {

    private List<FoodItemsDTO> foodItemsList;
    private Integer userId;
    private Restaurant restaurant;
    
    public OrderDTOFromFE() {
    	
    }
    
	public OrderDTOFromFE(Integer userId, List<FoodItemsDTO> foodItemsList, Restaurant restaurant) {
		super();
		this.userId = userId;
		this.foodItemsList = foodItemsList;
		this.restaurant = restaurant;
	}

	public List<FoodItemsDTO> getFoodItemsList() {
		return foodItemsList;
	}

	public void setFoodItemsList(List<FoodItemsDTO> foodItemsList) {
		this.foodItemsList = foodItemsList;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String toString() {
		return "OrderDTOFromFE [foodItemsList=" + foodItemsList + ", userId=" + userId + ", restaurant=" + restaurant
				+ "]";
	}

}
