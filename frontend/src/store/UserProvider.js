import { createContext, useState, useEffect } from 'react';

const UserContext = createContext();

const UserProvider = ({ children }) => {
    const [datas, setDatas] = useState([{
        id: 1,
        SupplierName: 'Medtronic',
        SupplierType: 'Manufacturer',
        Number: '000091',
        Name: 'SCRW',
        Version: 'A',
        Iteration: '1',
        CreatedBy: 'STEPHEN',
        CreatedDate: '01-01-2024',
        State: 'Open @',
    },
    {
        id: 2,
        SupplierName: 'Microsoft',
        SupplierType: 'Manufacturer',
        Number: '000091',
        Name: 'SCRW',
        Version: 'A',
        Iteration: '1',
        CreatedBy: 'STEPHEN',
        CreatedDate: '01-01-2024',
        State: 'Open @',
    },
    {
        id: 3,
        SupplierName: 'Amazon',
        SupplierType: 'Manufacturer',
        Number: '000091',
        Name: 'SCRW',
        Version: 'A',
        Iteration: '1',
        CreatedBy: 'STEPHEN',
        CreatedDate: '01-01-2024',
        State: 'Open @',
    },
    {
        id: 4,
        SupplierName: 'Paypal',
        SupplierType: 'Manufacturer',
        Number: '000091',
        Name: 'SCRW',
        Version: 'A',
        Iteration: '1',
        CreatedBy: 'STEPHEN',
        CreatedDate: '01-01-2024',
        State: 'Open @',
    }]);

    const [deleteuser,setDeleteUser] = useState([]);
    const [choice,setChoice] = useState(false);
    const [showAlert,setShowAlert] = useState(false);

    return <UserContext.Provider value={{datas,setDatas,deleteuser,setDeleteUser,choice,setChoice,showAlert,setShowAlert}}>
        {children}
    </UserContext.Provider>
}

export { UserContext, UserProvider };