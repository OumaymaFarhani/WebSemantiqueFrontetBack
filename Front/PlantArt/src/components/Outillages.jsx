import React, { useState, useEffect } from "react";
import axios from 'axios';

import styled from 'styled-components'
import {popularProducts} from "../data"
import { Product } from './Product'
const Container = styled.div`
    padding: 20px;
    display: flex;
    flex-wrap: wrap;
    justify-content: space-between;
`;
const Title = styled.h1`
  margin: 10px;
`;
export const Outillages = () => {
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
 
 
    return (
        <>
        <Container>
        <Title>A MAIN</Title>
            {DataPlante.map((item) =>(
                <Product item={item} key={item.id} />

            ))}
            </Container>
            <Container>
            <Title>A MOTEUR</Title>
             {DataPlante1.map((item) =>(
                <Product item={item} key={item.id} />

            ))}
            </Container>
         
          
        </>
    )
}
