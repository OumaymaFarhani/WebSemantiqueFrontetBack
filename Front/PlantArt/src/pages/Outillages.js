import React, { useState, useEffect } from "react";
import axios from 'axios';
import { Add, Remove } from "@material-ui/icons";
import styled from "styled-components";
import { Footer } from "../components/Footer";
import { Navbar } from "../components/Navbar";
import { Newsletter } from "../components/Newsletter";
import { Announcement } from './../components/Announcement';
import { mobile } from "../responsive";
import {
  FavoriteBorderOutlined,
  SearchOutlined,
  ShoppingCartOutlined,
} from "@material-ui/icons";


const Container = styled.div``;

const Wrapper = styled.div`
  padding: 50px;
  display: flex;
  ${mobile({ padding: "10px", flexDirection:"column" })}
`;

const ImgContainer = styled.div`
  flex: 1;
`;

const Image = styled.img`
  width: 100%;
  height: 90vh;
  object-fit: cover;
  ${mobile({ height: "40vh" })}
`;

const InfoContainer = styled.div`
  flex: 1;
  padding: 0px 50px;
  ${mobile({ padding: "10px" })}
`;

const Title = styled.h1`
  font-weight: 200;
`;

const Desc = styled.p`
  margin: 20px 0px;
`;

const Price = styled.span`
  font-weight: 100;
  font-size: 40px;
`;

const FilterContainer = styled.div`
  width: 50%;
  margin: 30px 0px;
  display: flex;
  justify-content: space-between;
  ${mobile({ width: "100%" })}
`;

const Filter = styled.div`
  display: flex;
  align-items: center;
`;

const FilterTitle = styled.span`
  font-size: 20px;
  font-weight: 200;
`;

const FilterColor = styled.div`
  width: 20px;
  height: 20px;
  border-radius: 50%;
  background-color: ${(props) => props.color};
  margin: 0px 5px;
  cursor: pointer;
`;

const FilterSize = styled.select`
  margin-left: 10px;
  padding: 5px;
`;

const FilterSizeOption = styled.option``;

const AddContainer = styled.div`
  width: 50%;
  display: flex;
  align-items: center;
  justify-content: space-between;
`;

const AmountContainer = styled.div`
  display: flex;
  align-items: center;
  font-weight: 700;
`;

const Amount = styled.span`
  width: 30px;
  height: 30px;
  border-radius: 10px;
  border: 1px solid teal;
  display: flex;
  align-items: center;
  justify-content: center;
  margin: 0px 5px;
`;

const Button = styled.button`
  padding: 15px;
  border: 2px solid teal;
  background-color: white;
  cursor: pointer;
  font-weight: 500;
  &:hover{
      background-color: #f8f4f4;
  }
`;
export const  Outillages =() => {
    const [DataPlante, setDataPlante] = useState([]);
    useEffect(()=>{
      axios.get('http://localhost:8089/getAMain',{})
      .then(res =>{
          setDataPlante(res.data)
      });
    },[]);
    const [DataPlante1, setDataPlante1] = useState([]);
    useEffect(()=>{
      axios.get('http://localhost:8089/getAMoteur',{})
      .then(res =>{
          setDataPlante1(res.data)
      });
    },[]);
 
return(
    <>
      <Navbar />
      <Announcement />
    {DataPlante.map((item) => {
        return( <Container>
         
    
      <Wrapper>
      <ImgContainer>
             <Image  src={item.image} alt="..."/>
      </ImgContainer>
      <InfoContainer>
          <Title>{item.item}</Title>
          <Desc>
          {item.description}
          </Desc>
          <Price>{item.prix}</Price>
          <FilterContainer>
            <Filter>
              <FilterTitle>{item.couleur}</FilterTitle>
              <FilterColor color="green" />
              <FilterColor color="darkgrey" />
              <FilterColor color="gray" />
            </Filter>
            <Filter>
              <FilterTitle>Taille</FilterTitle>
              <FilterSize>
                <FilterSizeOption>Pot 12 - Haut 45</FilterSizeOption>
                <FilterSizeOption>Pot 17 - Haut 70cm</FilterSizeOption>
             
              </FilterSize>
            </Filter>
          </FilterContainer>
          <AddContainer>
            <AmountContainer>
              <Remove />
              <Amount>1</Amount>
              <Add />
            </AmountContainer>
            <Button>AJOUTER AU PANIER</Button>
          </AddContainer>
        </InfoContainer>
      </Wrapper>
      
    </Container>
  
        )
    })}
   
     {DataPlante1.map((item) => {
        return( <Container>
         
    
      <Wrapper>
      <ImgContainer>
             <Image  src={item.image} alt="..."/>
      </ImgContainer>
      <InfoContainer>
          <Title>{item.item}</Title>
          <Desc>
          {item.description}
          </Desc>
          <Price>{item.prix}</Price>
          <FilterContainer>
            <Filter>
              <FilterTitle>{item.couleur}</FilterTitle>
              <FilterColor color="green" />
              <FilterColor color="darkgrey" />
              <FilterColor color="gray" />
            </Filter>
            <Filter>
              <FilterTitle>Taille</FilterTitle>
              <FilterSize>
                <FilterSizeOption>Pot 12 - Haut 45</FilterSizeOption>
                <FilterSizeOption>Pot 17 - Haut 70cm</FilterSizeOption>
             
              </FilterSize>
            </Filter>
          </FilterContainer>
          <AddContainer>
            <AmountContainer>
              <Remove />
              <Amount>1</Amount>
              <Add />
            </AmountContainer>
            <Button>AJOUTER AU PANIER</Button>
          </AddContainer>
        </InfoContainer>
      </Wrapper>
      
    </Container>
     )
    })}


</>

)


};
