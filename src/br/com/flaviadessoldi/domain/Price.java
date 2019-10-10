package br.com.flaviadessoldi.domain;

public class Price {
	Hotel hotel;
	Double price;
	
	public Price() {
		
	}
		
	public Price(Hotel hotel, double price) {
		super();
		this.hotel = hotel;
		this.price = price;
	}

	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.getHotel().getName() + this.getPrice();
	}
	
	@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Price other = (Price) obj;
			if (hotel == null) {
				if (other.hotel != null)
					return false;
			} else if (!hotel.equals(other.hotel))
				return false;
			if (price == null) {
				if (other.price != null)
					return false;
			} else if (!price.equals(other.price))
				return false;
			return true;
		}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hotel == null) ? 0 : hotel.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

}
