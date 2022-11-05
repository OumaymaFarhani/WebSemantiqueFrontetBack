import styled from 'styled-components'
import {categories, categories2} from "../data"
import { CategoryItem } from './CategoryItem'
import { mobile } from "../responsive";
import { CategoryItem2 } from './CategoryItem2';
const Container = styled.div`
display:flex;
padding:20px;
justify-content:space-between;
${mobile({ padding: "0px", flexDirection:"column" })}
`
export const Categories = () => {
    return (
        <>
        <Container>
            {categories.map((item)=>(
                <CategoryItem item={item} key={item.id} />
            ))}
        </Container>
         <Container>
         {categories2.map((item)=>(
             <CategoryItem2 item={item} key={item.id} />
         ))}
     </Container>
     </>
    )
}
