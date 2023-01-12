import{useState} from "react";
import "./App.css";
function App(){
  const[list,setList]=useState([]);
  const[value,setValue]=useState("");
  const addToList=()=>{
    let tempArr=list;
    tempArr.push(value);
    setList(tempArr);
    setValue("");
  };
  const deleteItem=(index)=>{
    let temp=list.filter((item,i)=> i !== index);
    setList(temp);
  };
  return(
    <div className="App">
      <fieldset>
        <h>Add product to list</h><br></br>
        <input type="text" value={value} onChange={(e)=>setValue(e.target.value)}/>
        <button onClick={addToList}>click to add</button><br></br><br></br>
        <h>product catalog</h><br></br>
        <ol>
          {list.map((item,i)=> <li onClick={()=>deleteItem(i)}>{item}</li>)}
        </ol>
        <h>click on product to delete</h><br></br>
      </fieldset>
    </div>
  );

}export default App;