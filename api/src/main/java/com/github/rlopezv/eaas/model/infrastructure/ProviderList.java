package com.github.rlopezv.eaas.model.infrastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.rlopezv.eaas.model.common.ListMeta;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ProviderList is a collection of Providers.
 */
@Schema(description = "ProviderList is a collection of Providers.")
public class ProviderList   {
  @JsonProperty("items")
  @Valid
  private List<Provider> items = null;

  @JsonProperty("metadata")
  private ListMeta metadata;

  public ProviderList items(List<Provider> items) {
    this.items = items;
    return this;
  }

  public ProviderList addItemsItem(Provider itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
 @Schema(defaultValue = "")
  @Valid

  public List<Provider> getItems() {
    return items;
  }

  public void setItems(List<Provider> items) {
    this.items = items;
  }

  public ProviderList metadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @Schema(defaultValue = "")
  @Valid
  public ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(ListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProviderList ProviderList = (ProviderList) o;
    return Objects.equals(this.items, ProviderList.items) &&
        Objects.equals(this.metadata, ProviderList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderList {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
