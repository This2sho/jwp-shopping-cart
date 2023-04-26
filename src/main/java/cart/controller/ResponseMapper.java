package cart.controller;

import cart.dao.ProductEntity;
import java.util.List;
import java.util.stream.Collectors;

public class ResponseMapper {
    public static List<ProductResponse> from(List<ProductEntity> productEntities){
        return productEntities.stream()
            .map(entity -> new ProductResponse(entity.getId(), entity.getName(), entity.getPrice(),
                entity.getImageUrl())).collect(
                Collectors.toList());
    }
}