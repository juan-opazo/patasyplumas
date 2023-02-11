import React from 'react';
import { useRouter } from 'next/router';

const PetItem = () => {
    const router = useRouter();
    return (
        <div>Pet page {router.query.id}</div>
    )
}

export default PetItem;